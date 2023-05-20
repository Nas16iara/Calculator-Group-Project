package com.group5.calculatorproject;

public class PhysicsEquations{
  
  private double speedOfLight, gravity, distance, time, velocity, deltaVelo, acceleration, force, mass, weight, momentum, frequency, wavelength, power, work, voltage, current, resistance;

  
  public double solveVelo(double distance, double time) {
    this.distance = distance;
    this.time = time;
    velocity = distance/time;
    return velocity;
  }
  
  public double solveDistance(double velocity, double time) {
    this.velocity = velocity;
    this.time = time;
    distance = velocity*time;
    return distance;
  }
 
   public double solveVeloTime(double velocity, double distance) {
     this.velocity = velocity;
     this.distance = distance;
     time = distance/velocity;
     return time;
   }
   
   public double solveAcceleration(double deltaVelo, double time){
     this.deltaVelo = deltaVelo;
     this.time = time;
     acceleration = deltaVelo/time;
     return acceleration;
   }
   
   public double solveDeltaVelo(double acceleration, double time){
     this.acceleration = acceleration;
     this.time = time;
     deltaVelo = acceleration*time;
     return deltaVelo;
   }
   
   public double solveAccelerationTime(double deltaVelo, double acceleration){
     this.deltaVelo = deltaVelo;
     this.acceleration = acceleration;
     time = deltaVelo/acceleration;
     return time;
   }
   
   public double solveForce(double mass, double acceleration){
     this.mass = mass;
     this.acceleration = acceleration;
     force = mass*acceleration;
     return force;
   }
   
    public double solveForceMass(double force, double acceleration){
     this.force = force;
     this.acceleration = acceleration;
     mass = force/acceleration;
     return mass;
   }
    
    public double solveForceAcceleration(double force, double mass){
     this.force = force;
     this.mass = mass;
     acceleration = force/mass;
     return acceleration;
   }
   
   public double solveWeight(double mass, double gravity){
     this.mass = mass;
     this.gravity = gravity;
     weight = mass*gravity;
     return weight;
   }
   
   public double solveWeightMass(double weight, double gravity){
     this.weight = weight;
     this.gravity = gravity;
     mass = weight/gravity;
     return mass;
   }
    public double solveGravity(double weight, double mass){
        this.weight = weight;
        this.mass = mass;
        gravity = weight/mass;
        return gravity;
    }
   
   public double solveMomentum(double mass, double velocity){
     this.mass = mass;
     this.velocity = velocity;
     momentum = mass*velocity;
     return momentum;
   }
   
   public double solveMomentumMass(double momentum, double velocity){
     this.momentum = momentum;
     this.velocity = velocity;
     mass = momentum/velocity;
     return mass;
   }
   
   public double solveMomentumVelo(double momentum, double mass){
     this.momentum = momentum;
     this.mass = mass;
     velocity = momentum/mass;
     return velocity;
   }
   
   public double solveWavelength(double frequency, double speedOfLight){
     this.frequency = frequency;
     this.speedOfLight = speedOfLight;
     wavelength = speedOfLight/frequency;
     return wavelength;
   }

    public double solveFrequency(double wavelength, double speedOfLight){
        this.wavelength = wavelength;
        this.speedOfLight = speedOfLight;
        frequency = speedOfLight/wavelength;
        return frequency;
    }
    public double solveSpeedOfLight(double wavelength, double frequency){
        this.wavelength = wavelength;
        this.frequency = frequency;
        speedOfLight = speedOfLight * wavelength;
        return speedOfLight;
    }
   
   public double solvePower(double work, double time){
     this.work = work;
     this.time = time;
     power = work/time;
     return power;
   }
   
   public double solvePowerTime(double power, double work){
     this.power = power;
     this.work = work;
     time = work/power;
     return time;
   }
   
   public double solveWork(double power, double time){
     this.power = power;
     this.time = time;
     work = time*power;
     return work;
   }
   
    public double solveVoltage(double current, double resistance){
     this.current = current;
     this.resistance = resistance;
     voltage = current*resistance;
     return voltage;
   }
    
    public double solveCurrent(double voltage, double resistance){
     this.voltage = voltage;
     this.resistance = resistance;
     current = voltage/resistance;
     return current;
   }
    
    public double solveResistance(double voltage, double current){
     this.voltage = voltage;
     this.current = current;
     resistance = voltage/current;
     return resistance;
   }
}