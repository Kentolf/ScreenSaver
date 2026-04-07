package ru.kentolf.screensaver;

class Vector {
    public double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void rotateY (double angle) {
        double currentX = this.x;
        double currentZ = this.z;

        this.x = currentX * Math.cos(angle) - currentZ * Math.sin(angle);
        this.z = currentX * Math.sin(angle) + currentZ * Math.cos(angle);
    }
}
