# Hurricane Prediction System 
A Java application demonstrating two design patterns: The Template Method and Command Design Pattern within a hurricane-prediction scenario. This system follows a standardised prediction workflow including fetching data, preprocessing it, making predictions, and then post-processing the results. Each of these steps is handled as an independent command, allowing for easy management, swapping, or extending of tasks.


## Description
Modelling a Hurricane Prediction Service that executes the repeatable prediction workflow while tasking with modular and reusable components. 
The Template Method, HurricanePredictionTemplate, defines the overall workflow, while the concrete subclasses (StatisticalPrediction and MachineLearningPrediction) implement the specific steps.
The Command Pattern encapsulates individual tasks (such as fetching data, running models, and saving results) as commands that a PredictionInvoker can schedule and execute.

# Design Patterns Implemented
## Template Method
The HurricanePredictionTemplate abstract class defines the fixed workflow for predicting hurricanes:
fetchData()
preprocessData()
applyPredictionModel()
postprocessResults()

Concrete subclasses override each step:
StatisticalPrediction
MachineLearningPrediction
Each provides its own behaviour, but follows the same sequence through the final method predictHurricane().

## 2. Command Pattern
Each task in the prediction workflow is wrapped in its own command class:
FetchDataCommand
PredictionCommand
SaveResultsCommand

Each command delegates the work to a receiver class:
WeatherDataFetcher
PredictionModel
ResultSaver
The PredictionInvoker stores commands and executes them in order using:
executeCommands();
Making the system task pipeline modular and easy to extend or reorganise.

## Features
Two complete prediction workflows:
Statistical
Machine Learning

Fully reusable and extensible command-based task pipeline
Clean separation between workflow steps and execution logic
Console output that clearly demonstrates each pattern in action
Ability to easily add new prediction models or new commands

## Requirements
JDK 8 
No external libraries required

## Installation
Download all .java files for the Hurricane Prediction System
Place them into the same directory
Open a terminal in that directory

## Usage
The program automatically demonstrates both:
Statistical Hurricane Prediction
Machine Learning Hurricane Prediction

Each will run through the full workflow:
Fetching Data
Preprocessing
Model Execution
Saving Results

## Class Structure
# Template Method Classes
HurricanePredictionTemplate
Base abstract workflow class
StatisticalPrediction
MachineLearningPrediction

## Command Pattern Classes
Command (interface)
FetchDataCommand
PredictionCommand
SaveResultsCommand

## Receiver Classes
WeatherDataFetcher
PredictionModel
ResultSaver

## Workflow Overview
Steps Defined by Template Method
fetchData(): Retrieve necessary data
preprocessData(): Prepare and clean data
applyPredictionModel(): Run the forecasting model
postprocessResults(): Save or process results
Subclasses override these methods to provide custom behaviour.

## Commands in the System
Each task is wrapped in a reusable command:
FetchDataCommand → calls WeatherDataFetcher.fetch()
PredictionCommand → runs PredictionModel.predict()
SaveResultsCommand → triggers ResultSaver.save()
PredictionInvoker Responsibilities
Add commands via addCommand()
Execute all steps with executeCommands()

## Adding New Predictions
To add a new prediction model:
Create a new subclass of HurricanePredictionTemplate
Override:
fetchData()
preprocessData()
applyPredictionModel()
postprocessResults()
Call predictHurricane() in Main

Project Structure
hurricane-prediction-system/
├── Main.java
├── Command.java
├── FetchDataCommand.java
├── PredictionCommand.java
├── SaveResultsCommand.java
├── HurricanePredictionTemplate.java
├── StatisticalPrediction.java
├── MachineLearningPrediction.java
├── WeatherDataFetcher.java
├── PredictionModel.java
├── ResultSaver.java
├── PredictionInvoker.java
└── README.md

