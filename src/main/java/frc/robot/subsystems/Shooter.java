package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

    SpeedController speedController;

    public Shooter(SpeedController speedController) {
        this.speedController = speedController;
    }

    public void shoot(){
        speedController.set(0.6);
    }

    public void shootWithSpeed(double speed){
        speedController.set(speed);
    }

    public void stopShooter(){
        speedController.stopMotor();
    }

}
