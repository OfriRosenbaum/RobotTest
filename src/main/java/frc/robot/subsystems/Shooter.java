package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

    private SpeedController speedController;
    private Encoder encoder;

    public Shooter(SpeedController speedController, Encoder encoder) {
        this.speedController = speedController;
        this.encoder = encoder;
        encoder.setDistancePerPulse(4096/360.0);

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

    public void resetEncoder() { encoder.reset(); }

    public double returnEncoderDistance() {
        return encoder.getDistance();
    }
}
