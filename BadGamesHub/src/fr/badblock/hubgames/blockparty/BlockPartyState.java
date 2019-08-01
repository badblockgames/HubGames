package fr.badblock.hubgames.blockparty;

public enum BlockPartyState {
	
	WAITING,
	PLAYING,
	FINISH;
	
    private static BlockPartyState currentState;
    
    public static void setState(BlockPartyState state){
    	BlockPartyState.currentState = state;
    }
    
    public static boolean isState(BlockPartyState state){
        return BlockPartyState.currentState == state;
    }
    public static BlockPartyState getState(){
        return currentState;
    }

}
