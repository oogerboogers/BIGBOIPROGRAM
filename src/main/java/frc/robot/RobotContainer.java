package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.ShooterCommand;
import frc.robot.commands.TankDriveCommand;
import frc.robot.subsystems.FlywheelSubsystem;
import frc.robot.subsystems.TankDriveSubsystem;


public class RobotContainer {
    private SendableChooser<Command> autonChooser = new SendableChooser<Command>();
    private CommandXboxController controller = new CommandXboxController(2);
    private TankDriveSubsystem tankDriveSubsystem = new TankDriveSubsystem();
    private TankDriveCommand tankDriveCommand;
    private FlywheelSubsystem shooter = new FlywheelSubsystem();

    private final Trigger shooterButton = controller.leftBumper();
    
    public RobotContainer() {
        configureShooter();
        configureTankDrive();
        configureAuto();
    }

    public void configureTankDrive() {
        tankDriveCommand = new TankDriveCommand(tankDriveSubsystem, controller);
        tankDriveSubsystem.setDefaultCommand(tankDriveCommand);
    }

    public void configureShooter() {
        shooterButton.toggleOnTrue(new ShooterCommand(shooter, 1));
        shooterButton.toggleOnFalse(new ShooterCommand(shooter, 0));
    }
    
    public void configureAuto() {
        autonChooser.setDefaultOption("No Auto", null);
    }

    public Command getAutonomousCommand() {
        return autonChooser.getSelected();
    }

    public void teleopInit() {
        Command auton = autonChooser.getSelected();
        if (auton != null) {
            auton.cancel();
        }
    }

}