import React from 'react';
import './Contact.css';


export default function Contact() {
    return (
        
            
           <div className="clr">
               <form className="frm">
  <div>
  <img src="https://cdn4.iconfinder.com/data/icons/basic-user-interface-elements/700/mail-letter-offer-256.png" alt="icon" />
   </div>
  <input type="text" placeholder="Name (required)" required />
  <input type="text" placeholder="Return address (required)" required />
  <input type="text" placeholder="Topic (required)" required />
  <textarea placeholder="Subject (required)" required></textarea>
  <input type="submit" value="Send" /> 
</form>
               </div>
            




           
       
  


    )
}
