package fr.badblock.hubgames.pvp;

public enum PvPState {
	
	WAITING,
	PLAYING,
	FINISH;
	
    private static PvPState currentState;
    
    public static void setState(PvPState state){
    	PvPState.currentState = state;
    }
    
    public static boolean isState(PvPState state){
        return PvPState.currentState == state;
    }
    public static PvPState getState(){
        return currentState;
    }

}
