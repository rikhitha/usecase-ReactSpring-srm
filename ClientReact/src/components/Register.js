import React ,{ useState }from 'react'

import './Login.css';

export default function Register() 
{
    const initialValues = {
        uname: "",
        upassword:"",
        cpassword:""
           
      };

      const [formValues, setFormValues] = useState(initialValues);
      
      const handleOnChange = (event) => {
    

        const { name, value } = event.target;
        console.log(name);
        console.log(value);
        setFormValues((prev) => {
          return {
            ...prev,
            [name]: value,
          };
        });
        console.log(formValues);
    };

    const handleDoSubmit = (e) =>
     {
        e.preventDefault();
        console.log("inside handledosubmit"+JSON.stringify(formValues));

        const reqOptios = {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(formValues)
        };
        fetch("http://localhost:8080/api/register", reqOptios).then(res => res.json()).then((data) => {
            

           

          console.log(data);
            console.log("saved register data");
            
        });
    }


    return (
        <div>
           <div class="user">
    <header class="user__header">
        <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/3219/logo.svg" alt="" />
        <h1 class="user__title">Register</h1>
    </header>
    
    <form class="form">
        <div class="form__group">
            <input type="text" name="uname" placeholder="Username" class="form__input" onChange={handleOnChange} />
        </div>
        
        <div class="form__group">
            <input type="password" name="upassword" placeholder="Password" class="form__input" onChange={handleOnChange} />
        </div>
        <div class="form__group">
            <input type="password" name="cpassword" placeholder="Confirm Password" class="form__input" onChange={handleOnChange}/>
        </div>
        
        <button class="btn" type="button" onClick={handleDoSubmit}>Register</button>
    </form>
</div>
            </div>
    )
}
