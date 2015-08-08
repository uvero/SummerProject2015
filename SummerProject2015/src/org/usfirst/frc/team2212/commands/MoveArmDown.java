package org.usfirst.frc.team2212.commands;

import org.usfirst.frc.team2212.robot.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveArmDown extends Command {

	public MoveArmDown() {
		requires(Subsystems.arm);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		if (!Subsystems.arm.isDown()) {
			Subsystems.arm.moveDown();
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Subsystems.arm.isDown();
	}

	// Called once after isFinished returns true
	protected void end() {
		Subsystems.arm.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
