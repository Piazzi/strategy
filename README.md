<div align="center">
  <h1> Strategy  </h1>
</div>

# Code

Simple project representing the Strategy design pattern. I've made a representation of a postal system.

# Definition

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable

![image](https://user-images.githubusercontent.com/40416044/152563574-941fccf2-037a-4b57-8d20-024eb9c81978.png)

For instance, a class that performs validation on incoming data may use the strategy pattern to select a validation algorithm depending on the type of data, the source of the data, user choice, or other discriminating factors. These factors are not known until run-time and may require radically different validation to be performed. The validation algorithms (strategies), encapsulated separately from the validating object, may be used by other validating objects in different areas of the system (or even different systems) without code duplication.

Source: <a href="https://en.wikipedia.org/wiki/Strategy_pattern"> Wikipedia </a> | <a href="https://refactoring.guru/design-patterns/strategy"> Refactoring Guru </a>
