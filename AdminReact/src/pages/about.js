import React from 'react';
  
const About = () => {
  const history = useHistory();

    const mystyle = {
        color: "white",
        
        padding: "60px",
        fontFamily: "Arial",
        height: "800px",
        backgroundImage:' url("https://www.loginradius.com/blog/start-with-identity/static/3b4c33cef1861297f7da778dff9074a7/a3513/login-security.png")',
        width: "100%"
      };

    const [auth,setAuth] = useState({
        username:"admin",
        password:"admin"
    });

    const handleChange = (e) => {
        const {name,value} = e.target;

        setAuth((prev)=> {
            return {
                ...prev,
                [name]:value
            }
        })
    }


    const handleSubmit = (e) => {
        e.preventDefault();
        if (auth.username.trim() === "") {
            alert("No Username");
            return;
        }
            
        
        if (auth.password.trim() === "") {
            alert("No Password");
            return;
        }

        axios.post("http://localhost:8080/authenticate",auth).then((res)=>{
            console.log(JSON.stringify(res));
            console.log(res.data.token);
            console.log(res.data.roles);
            let authdata = new Auth(res.data.token,res.data.roles);
            //authdata = new Auth('',[]);
            console.log(JSON.stringify(auth));
            sessionStorage.setItem("auth",JSON.stringify(authdata));
            history.push('/dashboard');
        }).catch(err =>{
            console.error(err);
            history.push('/error/100');
        })
    }

    useEffect(()=>{
        sessionStorage.removeItem("auth");
    },[]);
  return (
    <div
      style={{
        display: 'flex',
        justifyContent: 'Right',
        alignItems: 'Right',
        height: '100vh'
      }}
    >
      <h1>Genrate Cibil Report Here.</h1>
    </div>
  );
};
  
export default About;
