package org.firstinspires.ftc.teamcode.PinkCode.Subsystems;

import android.sax.StartElementListener;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.PinkCode.Hardware.HardWare;

public class DriveSystem {
    public HardWare hwmap;
    private Telemetry telemetry;

    private int SECONDS_PASSED = 0;
    private Boolean TIMER_RUNNING = false;

    public DriveSystem(HardwareMap hmap, Telemetry tel) {
        hwmap = new HardWare(hmap);
        telemetry = tel;
    }

    public void SafeTowerDrive(double tower_drive) {
        if (tower_drive == 1) {
            telemetry.addData("TIMER DATA", SECONDS_PASSED);
            telemetry.update();

            UnsafeTowerDrive(1, 1);

            telemetry.addData("Tower", "Moving Tower DOWN");
            telemetry.update();
        }

        if (tower_drive == -1) {
            telemetry.addData("TIMER DATA", SECONDS_PASSED);
            telemetry.update();

            UnsafeTowerDrive(-1, -1);

            telemetry.addData("Tower", "Moving Tower UP");
            telemetry.update();
        }
    }

    private void UnsafeTowerDrive(double Motor_tower_left, double Motor_tower_right) {
        hwmap.dcMotor_tower_right.setPower(Motor_tower_right);
        hwmap.dcMotor_tower_left.setPower(Motor_tower_left);

        hwmap.dcMotor_tower_right.setPower(0);
        hwmap.dcMotor_tower_left.setPower(0);

//        telemetry.addData("POSITION LEFT", hwmap.dcMotor_tower_left.getCurrentPosition());
//        telemetry.addData("POSITION RIGHT", hwmap.dcMotor_tower_right.getCurrentPosition());
//        telemetry.update();
    }
}
