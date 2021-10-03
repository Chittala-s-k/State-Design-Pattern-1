package state;

public class LockState implements State {
	Door door;
	public LockState(Door operator ) {
		this.door = operator;
	}

	public void doorOpen() {
		System.out.println("Door is Open ");
		//operator.setState(operator.getOpenState());
	}


	public void doorClose() {
		System.out.println("Door is Closed!");
		door.setState(door.getCloseState());
	}

	public void doorLock() {
		System.out.println("Door is Locked");
		door.setState(door.getLockState());
		
		
	}

	public void doorUnlock() {
		System.out.println("Door is Unlocked");
		if(door.checkCondition()) {
			door.setState(door.getUnlockState());
			door.checkCondition();
			
		}
		else {
			door.setState(door.getCloseState());
		}
	}


	public String toString() {
		return " Locked state";
	}
}
