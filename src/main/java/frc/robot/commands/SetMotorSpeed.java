package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.SwerveModule;

public class SetMotorSpeed extends Command{
double speed;
SwerveModule module;
    public SetMotorSpeed(double speedGiven, SwerveModule swerveModule) {
        this.speed = speedGiven; 
        this.module = swerveModule;
    }
    
    protected void initialize() {
    
    }
    protected void execute() {
        module.setDrive(speed);
    }
    
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
        module.setDrive(0);
    
    };
    protected void interrupted() {
        module.setDrive(0);
    }
    }
