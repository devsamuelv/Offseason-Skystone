package org.firstinspires.ftc.teamcode.PinkCode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.PinkCode.Subsystems.DriveSystem;

//@Autonomous(name = "Auto", group = "Auto")
public class Auto extends OpMode {
    private DriveSystem driveSystem = null;
    private int SKYSTONES_PLACED = 0;
    private Stages Stage = Stages.INIT;

    private enum Stages {
        INIT,
        GET_SKYSTONE,
        MOVE_TO_FOUNDATION,
        PLACE_SKYSTONE
    }

    @Override
    public void init() {
        driveSystem = new DriveSystem(hardwareMap, telemetry);
        driveSystem.hwmap.Init();
    }

    @Override
    public void loop() {
        switch (Stage) {
            case INIT:
//                driveSystem.BaseDrive(1.0, 1.0, 0);
                break;

            case GET_SKYSTONE:
                telemetry.addData("Function", "Not Finished GET_SKYSTONE");
                telemetry.update();
                break;


            case MOVE_TO_FOUNDATION:
                telemetry.addData("Function", "Not Finished MOVE_TO_FOUNDDATION");
                break;
        }
    }

    @Override
    public void stop() {
        telemetry.addData("[ROBOT]", "Robot Stop");
        telemetry.update();
    }
}
