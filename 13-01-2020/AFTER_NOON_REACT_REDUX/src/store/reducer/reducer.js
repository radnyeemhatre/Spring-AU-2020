const initState = {
	data:[]
}

const userinfo = (state = initState, action) => {
	if(action.type === 'CLICKED') {
		if(action.data){
			
			return {
			...state,
			data: state.data.concat(action.data)
			}	
		}		
	}
	return state;
}

export default userinfo;