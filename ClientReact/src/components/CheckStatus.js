import React from 'react'

import './CheckStatus.css';

export default function CheckStatus() {
    return (
        <div className="body">
            <div class="container px-1 px-md-4 py-5 mx-auto">
             <div class="card">
             <div class="row d-flex justify-content-between px-3 top">
             <div class="d-flex">
             <input type="text" className="cst" name="pan" placeholder="pan number"/>
            
             
             <button  className="buttc" type="button">Check Status </button>
                 </div>
                 <div class="d-flex flex-column text-sm-right">
                 <p class="mb-0">Expected Arrival: <span></span></p>
                 <p>Status:<span class="font-weight-bold"></span></p>


                 </div>
                 </div>
                 <div class="row d-flex justify-content-center">
            <div class="col-12">
            <ul id="progressbar" class="text-center">
                    <li class="active step0"></li>
                    <li class="active step0"></li>
                    <li class="active step0"></li>
                    <li class="step0"></li>
                </ul>
                </div>
            </div>
            <div class="row justify-content-between top">
            <div class="row d-flex icon-content"> <img class="icon" src="https://i.imgur.com/9nnc9Et.png" />
            <div class="d-flex flex-column">
            <p class="font-weight-bold">Recieved</p>
            </div>
                </div>
                <div class="row d-flex icon-content"> <img class="icon" src="https://i.imgur.com/u1AzR7w.png"></img>
                <div class="d-flex flex-column">
                <p class="font-weight-bold">Athenticating documents</p>
                </div>
                </div>
                <div class="row d-flex icon-content"> <img class="icon" src="https://i.imgur.com/TkPm63y.png"></img>
                <div class="d-flex flex-column">
                <p class="font-weight-bold">Accepted</p>
                </div>
                </div>
                <div class="row d-flex icon-content"> <img class="icon" src="https://i.imgur.com/HdsziHP.png"></img>
                <div class="d-flex flex-column">
                <p class="font-weight-bold">Credit Card Diapatched</p>
                </div>
                </div>
            </div>

             </div>
             </div>
        </div>
    )
}
