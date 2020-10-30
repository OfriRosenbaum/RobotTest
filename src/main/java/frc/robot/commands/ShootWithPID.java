package frc.robot.commands;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

import java.util.function.Supplier;

public class ShootWithPID extends CommandBase {

    private Shooter shooter;
    private Supplier<Double> kP;
    private Supplier<Double> kI;
    private Supplier<Double> kD;
    private Supplier<Double> tolerance;
    private Supplier<Double> setpoint;
    private PIDController pidController;

    public ShootWithPID (Shooter shooter, Supplier<Double> kP, Supplier<Double> kI,
                        Supplier<Double> kD, Supplier<Double> tolerance, Supplier<Double> setpoint) {

        this.shooter = shooter;
        this.kP = kP;
        this.kI = kI;
        this.kD = kD;
        this.tolerance = tolerance;
        this.setpoint = setpoint;
        addRequirements(shooter);

    }



    @Override
    public void initialize() {
        pidController = new PIDController(kP.get(), kI.get(), kD.get());
        shooter.resetEncoder();
    }

    @Override
    public void execute() {
        pidController.setPID(kP.get(), kI.get(), kD.get());
        pidController.setTolerance(tolerance.get());
        shooter.shootWithSpeed(pidController.calculate(shooter.returnEncoderDistance(), setpoint.get()));
        //* need encoder, need max balls
    }
}
