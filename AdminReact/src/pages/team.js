import React ,{ useState } from 'react';
  
const Teams = () => 
{

  const initialValues = {
    uname: "",
    upannumber:"",
    ustatus:"",
    adminid:""
       
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
    fetch("http://localhost:8080/api/status", reqOptios).then(res => res.json()).then((data) => {
        

       

      console.log(data);
        console.log("saved register data");
        
    });
}


  return (
    <div>
      <center>
           <div class="user">
    <header class="user__header">
        <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/3219/logo.svg" alt="" />
        <h1 class="user__title">Send Application Status</h1>
    </header>
    
    <form class="form">
        <div class="form__group">
            <input type="text" name="uname" placeholder="Customer Name" class="form__input" onChange={handleOnChange} />
        </div>
        <br />
        
        <div class="form__group">
            <input type="text" name="upannumber" placeholder="Customer Pannumber" class="form__input" onChange={handleOnChange} />
        </div>
        <br />
        
        <div class="form__group">
            <input type="text" name="ustatus" placeholder="Accept/Reject" class="form__input" onChange={handleOnChange}/>
        </div>
        <br />
        
        <div class="form__group">
            <input type="text" name="adminid" placeholder="Admin id" class="form__input" onChange={handleOnChange}/>
        </div>
        <br />
        <button class="btn" type="button" onClick={handleDoSubmit}>Send Status</button>
    </form>
</div></center>
            </div>
            
  );
};
  
export default Teams;