package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI;
import frc.robot.commands.TankDrive;

public class DriveTrain extends SubsystemBase {
    private SpeedController leftSpeedController;
    private SpeedController rightSpeedController;

    public DriveTrain(SpeedController leftSpeedController, SpeedController rightSpeedController) {
        this.leftSpeedController = leftSpeedController;
        this.rightSpeedController = rightSpeedController;
    }
    public void move(double speedLeft, double speedRight){
        leftSpeedController.set(speedLeft);
        rightSpeedController.set(speedRight);
    }
    public void stop(){
        leftSpeedController.stopMotor();
        rightSpeedController.stopMotor();
    }

    @Override
    public Command getDefaultCommand(){
        return new TankDrive(OI::getLeftY, OI::getRightY, this);
    }
}
