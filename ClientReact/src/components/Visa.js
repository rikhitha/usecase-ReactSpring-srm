import React from 'react'

import { useHistory } from "react-router-dom";

import './Visa.css';
export default function Visa() {
    const history = useHistory();

    const his = (e) => {
        
       history.push("/Applycc");
        
    }
    return (
        <div className="b">
            <div id="cr">	
	
    
        <div class="product-details">
           
        <h1>Visa Platinum</h1>
    		
    
        <span class="hint-star star">
            <i class="fa fa-star" aria-hidden="true"></i>
            <i class="fa fa-star" aria-hidden="true"></i>
            <i class="fa fa-star" aria-hidden="true"></i>
            <i class="fa fa-star-half-o" aria-hidden="true"></i>
            <i class="fa fa-star-o" aria-hidden="true"></i>
        </span>
            
        
    
            
    
            
            
    
    <div class="control">
        
    
        <button onClick={his} class="but">
    
         <span class="price">=</span>
    
         
    
       <span class="buy">Apply</span>
     </button>
        
        
    </div>
                
    </div>
        
    
        
    <div class="product-image">
        
        <center><img src="data:image/webp;base64,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" alt="Omar Dsoky" /></center>
        
    
    <div class="info">
        <h2>Benefits</h2>
        <ul>
            <li><strong>5 Reward Points for every ₹ 150 spent</strong></li>
            <li><strong>Global Personal Concierge -24 X 7  </strong></li>
            
        </ul>
    </div>
    </div>
   
    
    
    </div>
    
    
    
        </div>
    )
}
