package fr.badblock.hubgames.archery;

public enum ArcheryState {
	
	WAITING,
	PLAYING,
	FINISH;
	
    private static ArcheryState currentState;
    
    public static void setState(ArcheryState state){
    	ArcheryState.currentState = state;
    }
    
    public static boolean isState(ArcheryState state){
        return ArcheryState.currentState == state;
    }
    public static ArcheryState getState(){
        return currentState;
    }

}
