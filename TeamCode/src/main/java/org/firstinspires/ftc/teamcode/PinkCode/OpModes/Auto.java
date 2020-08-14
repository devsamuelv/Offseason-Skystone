package org.firstinspires.ftc.teamcode.PinkCode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.PinkCode.Subsystems.DriveSystem;

//@Autonomous(name = "Auto", group = "Auto")
public class Auto extends OpMode {
    private DriveSystem driveSystem = null;
    private Stages Stage = Stages.INIT;

    private enum Stages {
        INIT,
        STAGETwo,
        STAGEThree,
        STOP
    }

    @Override
    public void init() {
        driveSystem = new DriveSystem(hardwareMap, telemetry);
        driveSystem.hwmap.Init();
    }

    @Override
    public void loop() {
        try {
            switch (Stage) {
                case INIT:
                    telemetry.addData("Stage", "INIT");
                    telemetry.update();

                    for (int i = 0; i != 1000; i++) {
//                        driveSystem.Drive(false, false, 1.0, 1.0, 1.0, 1.0);
                    }

                    Stage = Stages.STAGETwo;
                    break;

                case STAGETwo:
                    telemetry.addData("Stage", "Stage Two");
                    telemetry.update();

                    for (int i = 0; i != 1000; i++) {
//                        driveSystem.Drive(false, false, 1.0, -1.0, 1.0, -1.0);
                    }

                    Stage = Stages.STOP;
                    break;

                case STOP:
                    telemetry.addData("Status", "Stopping");
                    telemetry.update();

                    return;

                default:
                    telemetry.addData("[STAGE ERROR]", "Stage Not Found!");
                    telemetry.update();
                    break;
            }
        } catch (Exception e) {
            telemetry.addData("[ERROR]", e.getMessage());
            telemetry.update();
        }
    }

    @Override
    public void stop() {
        telemetry.addData("[ROBOT]", "Robot Stop");
        telemetry.update();
    }
}
