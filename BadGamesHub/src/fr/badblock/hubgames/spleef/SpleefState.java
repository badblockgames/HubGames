package fr.badblock.hubgames.spleef;

public enum SpleefState {
	
	WAITING,
	PLAYING,
	FINISH;
	
    private static SpleefState currentState;
    
    public static void setState(SpleefState state){
    	SpleefState.currentState = state;
    }
    
    public static boolean isState(SpleefState state){
        return SpleefState.currentState == state;
    }
    public static SpleefState getState(){
        return currentState;
    }

}
