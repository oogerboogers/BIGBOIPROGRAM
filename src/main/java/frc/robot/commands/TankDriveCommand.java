package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.TankDriveSubsystem;

public class TankDriveCommand extends CommandBase{
    private TankDriveSubsystem m_tankDrive;
    private CommandXboxController m_controller;

    public TankDriveCommand(TankDriveSubsystem tankDriveSubsystem, CommandXboxController controller) {
        m_tankDrive = tankDriveSubsystem;
        m_controller = controller;
        addRequirements(tankDriveSubsystem);
    }
    
    @Override
    public void execute() {
        // In this method, call the methods you made in the TankDrive
        // In order to set the percent output of the drive motors
    }
}
