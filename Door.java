package state;

public class Door {
	State openState;
	State closeState;
	State lockState;
	State unlockState;

	
	State state = closeState;
	boolean key= false;
	
	public Door(boolean key ) { 
		openState = new OpenState(this);
		closeState = new CloseState(this);
		lockState = new LockState(this);
		unlockState = new UnlockState(this);
		this.key=key;
		if(key) {
			state=closeState;
		}
	}
	public void doorOpen() {
		state.doorOpen();
	}
	public void doorClose() {
		state.doorClose();
	}
	public void doorLock() {
		state.doorLock();
	}
	public void doorUnlock() {
		state.doorUnlock();
	}

	public State getUnlockState() {
		return unlockState;
	}
	public State getLockState() {
		return lockState;
	}
	public State getCloseState() {
		return closeState;
	}
	public State getOpenState() {
		return openState;
	}
	public boolean checkCondition() {
		return  key;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public String toString() {
		
		return "Door is "+state;
	}
	
}