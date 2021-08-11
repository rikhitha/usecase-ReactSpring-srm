import React from 'react'
import './Dashboard.css';

import { useQRCode } from 'react-hook-qrcode';

import { Route, BrowserRouter as Router, Switch, Link } from "react-router-dom";

export default function Dashboard() {

    const [inputRef] = useQRCode({
        text: "age :18 yrs above,cibil score:>750",
        options: {
          level: 'M',
          margin: 7,
          scale: 1,
          width: 200,
          color: {
            dark: '#49D49D',
            light: '#A2C7E5',
          },
        },
      });
    
    return (
        // <div style={{backgroundColor: "lightblue"}}>
        //     <h1>In dashboard</h1>
        // </div>
        <div>
            
            <html>
  <head>
 
  </head>
  <body>

      <div style={{backgroundColor: "#e2e2e2"}}>
          <br /><br /><br /><br /><br /><br /><br />
          
  <center><h1>Scan to check Eligibility</h1><canvas ref={inputRef} /></center></div>
      <div class="area"></div><nav class="main-menu">
            <ul>
                <li>
                    <a href="#">
                        <i class="fa fa-home fa-2x"></i>
                        <span class="nav-text">
                        <Link className="link" to="/Dashboard" >Home</Link>
                        </span>
                    </a>
                  
                </li>
                <li class="has-subnav">
                    <a href="#">
                        <i class="fa fa-credit-card"></i>
                        <span class="nav-text">
                        <Link className="link" to="/CreditCards" >Credit Cards</Link>
                        </span>
                    </a>
                    
                </li>
                <li class="has-subnav">
                    <a href="#">
                       <i class="fa fa-book"></i>
                        <span class="nav-text">
                        <Link className="link" to="/Applycc" >Cibil Report</Link>
                        </span>
                    </a>
                    
                </li>
                <li class="has-subnav">
                    <a href="#">
                       <i class="fa fa-list fa-2x"></i>
                        <span class="nav-text">
                        <Link className="link" to="/Applycc" >Apply Credit Cards</Link>
                        </span>
                    </a>
                   
                </li>
                <li>
                    <a href="#">
                        <i class="fa fa-check"></i>
                        <span class="nav-text">
                        <Link className="link" to="/CheckStatus" >Check ApplicationStatus</Link>
                        </span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class="fa fa-asterisk"></i>
                        <span class="nav-text">
                        <Link className="link" to="/Ccdetails" >Credit Card Details</Link>
                        </span>
                    </a>
                </li>
                <li>
                   <a href="#">
                       <i class="fa fa-money"></i>
                        <span class="nav-text">
                        <Link className="link" to="/Applycc" >Payment</Link>
                        </span>
                    </a>
                </li>
                <li>
                   <a href="#">
                        <i class="fa fa-info-circle"></i>
                        <span class="nav-text">
                        <Link className="link" to="/About" >About</Link>
                        </span>
                    </a>
                </li>
                <li>
                    <a href="#">
                       <i class="fa fa-location-arrow"></i>
                        <span class="nav-text">
                        <Link className="link" to="/Contact" >Contact</Link>
                        </span>
                    </a>
                </li>
            </ul>

            <ul class="logout">
                <li>
                   <a href="#">
                         <i class="fa fa-power-off fa-2x"></i>
                        <span class="nav-text">
                        <Link className="link" to="/Login" >Logout</Link>
                        </span>
                    </a>
                </li>  
            </ul>
        </nav>
  </body>
    </html>
            </div>
    )
}
