import React from 'react';
import data from './data.json';
class NewComponent extends React.Component {
        constructor(props){
            super(props);
            this.state = {
            d: data,
            current_item: [],
            
        }
    }
displayFunction(dt){
        var temp=[];
        temp=this.state.current_item;
        temp.push(dt);
        this.setState({current_item:temp});
        console.log(this.state.current_item);
        
    }
render(){
    console.log(this.state.d);
    const list = this.state.d;
    
    return (
        <div>
            <div style={{width:"30%",
    display:"block",
    float: "left",
    marginLeft:"10%"}} >
                <p>Hello</p>
                <ul>
                    {list.map((dt)=>(<li onClick={()=>this.displayFunction(dt)} key={dt.id}>{dt.id},  {dt.city},  station: {dt.station}</li>))}
                </ul>
            </div>
            <div style={{width:"30%",
    display:"block",
    float: "right ",
    marginRight:"10%"}}>
                <ul>
                   {this.state.current_item.map((i)=>(<li key={i.id}>{i.id},  {i.city},  station: {i.station}</li>))}
                </ul>
            </div>
        </div>
    )
    } 
}
export default NewComponent;
