package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Feeder;

public class Feed extends CommandBase {

    private Feeder feeder;
    private double timeOfStart;
    public Feed(Feeder feeder){
        this.feeder = feeder;
        this.timeOfStart = Timer.getFPGATimestamp();
        addRequirements(feeder);
    }
    @Override
    public void execute(){
        feeder.feed();
    }
    @Override
    public boolean isFinished(){
        return (Timer.getFPGATimestamp()-timeOfStart>=500);
    }
    @Override
    public void end(boolean interrupted) {
        feeder.stopFeeder();}
}
