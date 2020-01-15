import React from 'react';
import data from './data.json';
class NewComponent2 extends React.Component {
        constructor(props){
            super(props);
            this.state = {
            d: data,
            curr1:data,
            
        }
    }
 displayFunction=evt=>{
     var inp=evt.target.value;
     //console.log(inp);
     var re1=new RegExp(inp);
   
    //console.log(this.state.re);
    var ct=this.state.d.filter((i)=>{
       // console.log(re1);
        if(re1.test(i.city))
        {
            //console.log(i)
            return i;
        }
        
    });
    console.log("aa")
    console.log(ct);
    this.setState({curr1:ct});
    //console.log("aparna");
    console.log(this.state.curr1);
    }
render(){
    //console.log(this.state.d);
    const list = this.state.d;
    
    return (
        <div>
            <div  >
                <p>Hello</p>
                <input type="text" palceholder="Enter City "onChange={this.displayFunction}></input>
            </div>
            <div>
                <ul>
                   {this.state.curr1.map((i)=>(<li key={i.id}>{i.id},  {i.city},  station: {i.station}</li>))}
                </ul>
            </div>
        </div>
    )
    } 
}
export default NewComponent2;
