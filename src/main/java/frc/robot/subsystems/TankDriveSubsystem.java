package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.components.TalonComponent;
import frc.robot.components.TalonComponent.TalonMotor;
import frc.robot.Constants.TankDriveConstants;
public class TankDriveSubsystem extends SubsystemBase{
    // Declare left and right side motors here,
    // but don't set them to a value here
    private TalonComponent leftMotor;
    private TalonComponent rightMotor;        
        // In the constructor, now set the motors to a value
        public TankDriveSubsystem() {
            leftMotor = new TalonComponent(TankDriveConstants.DRIVE_LEFT_MOTOR_ID, TalonMotor.TalonSRX);
            rightMotor = new TalonComponent(TankDriveConstants.DRIVE_RIGHT_MOTOR_ID, TalonMotor.TalonSRX);
        }
    /** 
     * @author Yijia Mao
     * 
     * @param percent
     */

    // Now create two methods, one for each motor
    // These methods should set the percent
    // Output of the left and right motors respectively
    public void setMotorSpeedR(double percent) {
        rightMotor.setOutput(percent);
    
}
public void setMotorSpeedL(double percent) {
    leftMotor.setOutput(percent);

}
}