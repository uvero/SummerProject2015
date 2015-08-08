package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Subsystems;


public class StopArm extends SingleActionCommand {

	public StopArm() {
		requires(Subsystems.arm);
	}

	@Override
	protected void doAction() {
		Subsystems.arm.stop();
	}
}
