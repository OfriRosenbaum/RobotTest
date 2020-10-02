package frc.robot.commands;


import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class Shoot extends CommandBase {

    private Shooter shooter;
    private double timeOfStart;
    public Shoot(Shooter shooter) {
        this.shooter = shooter;
        this.timeOfStart=Timer.getFPGATimestamp();
    }
    @Override
    public void execute(){
        shooter.shoot();
    }
    @Override
    public boolean isFinished(){
        return (Timer.getFPGATimestamp()-timeOfStart>=500);
    }
    @Override
    public void end(boolean interrupted) {shooter.stopShooter();
    }

}
