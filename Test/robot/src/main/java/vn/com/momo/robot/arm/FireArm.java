package vn.com.momo.robot.arm;

import javax.inject.Inject;

public class FireArm implements Arm {

  @Inject
  FireArm() {}

  @Override
  public void punch() {
    System.out.println("Ejecting fire!");
  }
}
