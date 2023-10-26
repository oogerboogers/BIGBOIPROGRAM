package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.FlywheelSubsystem;

public class ShooterCommand extends CommandBase{
    private FlywheelSubsystem shooter;
    private double targetOutput;
    public ShooterCommand(FlywheelSubsystem shooter, double targetOutput) {
        this.shooter = shooter;
        this.targetOutput = targetOutput;
    }

    public void initialize() {
        shooter.setShooterSpeed(targetOutput);
    }

    public boolean isFinished() {
        return true;
    }

}
