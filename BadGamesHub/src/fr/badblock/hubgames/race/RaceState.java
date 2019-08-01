package fr.badblock.hubgames.race;

public enum RaceState {
	
	WAITING,
	PLAYING,
	FINISH;
	
    private static RaceState currentState;
    
    public static void setState(RaceState state){
    	RaceState.currentState = state;
    }
    
    public static boolean isState(RaceState state){
        return RaceState.currentState == state;
    }
    public static RaceState getState(){
        return currentState;
    }


}
