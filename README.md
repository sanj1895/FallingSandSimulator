# Falling Sand Simulator
A Java-based interactive simulation for visualizing and experimenting with particle behavior such as falling sand, flowing water, and solid metal.

## Features

- **Particle Simulation**: Models behavior for sand, water, and metal particles in a grid-based environment.
- **Interactive GUI**: Allows users to place and manipulate particles on the grid using a graphical interface.
- **Dynamic Physics**: Implements basic physical interactions like falling, flowing, and stacking.
- **Customizable Speed**: Adjust the simulation speed using a slider control.

## Technologies Used

- **Java**: Core programming language for simulation logic and graphical user interface.
- **Swing & AWT**: Libraries for GUI development and event handling.

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/sanj1895/falling-sand-simulator.git
   ```
2. Navigate to the project directory:
   ```bash
   cd falling-sand-simulator
   ```
3. Compile the Java files:
   ```bash
   javac *.java
   ```
4. Run the program:
   ```bash
   java Runner
   ```

## Project Structure

```
falling-sand-simulator/
│
├── Runner.java          # Entry point for the simulation
├── SandLab.java         # Core simulation logic
├── SandDisplay.java     # GUI and user interaction
├── README.md            # Project documentation
└── LICENSE              # License for the project
```

## Future Enhancements

- **Additional Particle Types**: Include new materials like lava, oil, and gas with unique behaviors.
- **Obstacle Modes**: Introduce objects that interact dynamically with particles.
- **Save/Load Simulations**: Allow users to save the current state and resume later.
- **Enhanced Physics**: Refine interactions for more realistic behavior.

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add feature description"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-name
   ```
5. Open a Pull Request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

---

**Author**: Sanjana Anand
