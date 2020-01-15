import React from 'react';

class DisplayComponent extends React.Component {
    constructor(props){
        super(props);
        this.state = {
        
        current_item: [],
        
    }
}
    render() {
            
            return (
               
                <div>
                    <p>Hello</p>
                <ul>
                    {this.props.d.map((dt)=>(<li onClick={()=>this.displayFunction(dt)} key={dt.id}>{dt.id},  {dt.city},  station: {dt.station}</li>))}
                </ul>
                </div>
            );
        }
    }

    export default DisplayComponent;
