package vn.com.momo.robot.arm;

import javax.inject.Inject;

public class LaserArm implements Arm {

  @Inject
  LaserArm() {}

  public void punch() {
    System.out.println("Ejecting a laser beam!");
  }
}
