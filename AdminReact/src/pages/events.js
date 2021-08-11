import React ,{useState}from 'react';

import { useHistory } from "react-router-dom";

import ReactHTMLTableToExcel from 'react-html-table-to-excel'; 
  
const Events = () => {

  const [inData, setinData] = useState([])

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


  const fetchdata = () =>
    {
        console.log("data will be fetched");
        fetch("http://localhost:8080/api/application").then(res => res.json()).then(data => {
            console.log(data);
            setinData(data);
            // setSearch(data);

        }).catch(e => {
            console.log("Error cought");
            console.log(e);
        }).finally(() => {
            console.log("I will work always...")
        })


    }

    const handleCibil = () =>
    {
      console.log("inside handleCibil");
      history.push("/about");
    }

    const handleDelete = () =>
    {
      console.log("inside handleDelete");
    }
  return (
    <div>
    <button type="submit" onClick={fetchdata}>View Registrations</button>
      <br>
      </br>
      <br>
      </br>
    <table border="3" id="student" class="table">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Phone number</th>
                    <th>Age</th>
                    <th>Gender</th>
                    <th>Country</th>
                    <th>Pan Number</th>
                    <th>Income</th>
                    <th>Card Type</th>
                    <th>Check Cibil score</th>
                    <th>Delete</th>

                    

                </tr>
            </thead>
            {inData.map((x)=>
            {
                return (
                    <tbody>
                        <tr>

                            <td>{x.name}</td>

                            <td>{x.email}</td>

                            <td>{x.phone}</td>

                            <td>{x.age}</td>

                            <td>{x.gender}</td>

                            <td>{x.country}</td>

                            <td>{x.pannumber}</td>

                            <td>{x.income}</td>

                            <td>{x.ctype}</td>

                            <td><button onClick={handleCibil}>CibilReport</button></td>

                            <td><button onClick={handleDelete}>Delete</button></td>
                        </tr>
                    </tbody>
                
        );

                
            })}
    
    </table>

    <br/>
    <br/>
    <div>  

                                <ReactHTMLTableToExcel  

                                        className="btn btn-info"  
                                      table="student"  

                                        filename="Credit Card Applications"  

                                        sheet="Sheet"  

                                        buttonText="Download Applications" />  

                        </div>  
</div>
)
    
  
}
  
export default Events;
