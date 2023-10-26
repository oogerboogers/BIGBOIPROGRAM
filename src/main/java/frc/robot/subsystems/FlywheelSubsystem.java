package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.FlywheelConstants;
import frc.robot.components.TalonComponent;
import frc.robot.components.TalonComponent.TalonMotor;

public class FlywheelSubsystem extends SubsystemBase{
    private TalonComponent leftMotor;
    private TalonComponent rightMotor;

    public FlywheelSubsystem() {
        leftMotor = new TalonComponent(FlywheelConstants.SHOOTER_MOTOR_1_ID, TalonMotor.TalonSRX);
        rightMotor = new TalonComponent(FlywheelConstants.SHOOTER_MOTOR_2_ID, TalonMotor.TalonSRX);
    }

    public void setShooterSpeed(double targetOutput) {
        leftMotor.setOutput(targetOutput);
        rightMotor.setOutput(-targetOutput);
    }
}
