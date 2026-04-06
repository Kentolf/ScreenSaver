package ru.kentolf.screensaver;

class Matrix {
    public double[][] values;

    public Matrix(double[][] values) {
        this.values = values;
    }

    public Vector multiply(Vector v) {
        double newX = values[0][0] * v.x + values[0][1] * v.y + values[0][2] * v.z;
        double newY = values[1][0] * v.x + values[1][1] * v.y + values[1][2] * v.z;
        double newZ = values[2][0] * v.x + values[2][1] * v.y + values[2][2] * v.z;

        return new Vector(newX, newY, newZ);
    }
}
