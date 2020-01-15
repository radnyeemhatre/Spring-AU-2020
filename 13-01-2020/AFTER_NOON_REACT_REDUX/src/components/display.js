import React from 'react';
import Country from "./country"
import { connect } from 'react-redux';

class Display extends React.Component{
	 
	constructor(props){
      super(props);
      this.state = {
            data:Country		
      }
	 }
	 

    handleCheck(e){
			this.props.saveUserDetails('data', e);
            

	}
    
	render() {
	   
	
		return ( 
				<div >
                    
                <div style={{
					'boxSizing' : "border-box",
					'width': "50%",
					'float':"left"}}>
                    
                    
                <table>
                    <tbody>
                    
				{this.state.data.map((dt) => {
				return (<tr  key={dt.id} onClick={() => this.handleCheck(dt)} >
                <td >{dt.id}</td>
                <td >{dt.state}</td>
                <td>{dt.city}</td>
                <td>{dt.pollutant_id}</td>
               
                </tr>)
				})}
                 </tbody>
                </table>
				</div>

				<div style={{
					'boxSizing' : "border-box",
					'width': "50%",
					'float':"left"}}>
                        <table>

                    <tbody>
                    
				{this.props.ay.map((i) => {
				return (<tr  key={i.id}  >
                    <td>{i.id}</td>
                    <td>{i.state}</td>
                    <td>{i.city}</td>
                    <td>{i.pollutant_id}</td>
                    
                    </tr>)
				})}
                </tbody>
                </table>
				</div>
			</div>
		)
      }     
}

const mapStateToProps = (state) => {
	return{
		ay: state.data,
	}
}

const mapDispatchToProps = (dispatch) => {
	return{
		saveUserDetails: (name, val) => {dispatch({type: 'CLICKED', [name]: val})}
	}
}

export default connect(mapStateToProps, mapDispatchToProps)(Display);
