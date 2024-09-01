# News Application

A News application built using Kotlin that displays the latest news from various sources and categories such as sports, politics, technology, business, and more. The application follows the MVVM (Model-View-ViewModel) architecture pattern and utilizes several modern Android development libraries and tools.

## Demo Video

https://github.com/user-attachments/assets/0d38e084-8730-46b2-842c-b6e7b890c907

## Features

- **Multiple Categories**: Browse news articles from different categories including sports, politics, technology, business, and others.
- **ViewModel**: Manages UI-related data in a lifecycle-conscious way, allowing data to survive configuration changes such as screen rotations.
- **Room Database**: Provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.
- **Retrofit**: A type-safe HTTP client for Android and Java that simplifies network requests.
- **MVVM Architecture**: Ensures a clean separation of concerns by using ViewModel, LiveData, and Repository patterns.
- **XML Layouts**: Designed using Android's XML layouts for a consistent and responsive user interface.

## Technologies and Tools Used

- **Kotlin**: Primary programming language used for Android development.
- **XML**: For designing the user interface.
- **ViewModel**: To manage UI-related data in a lifecycle-aware manner.
- **Room Database**: For local data storage and caching.
- **Retrofit**: For making network calls and parsing responses.
- **MVVM Pattern**: Ensures a clean separation between the UI and the business logic.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/YoussefFayad/News-App.git
   ```
2. Open the project in Android Studio.
3. Build and run the application on an emulator or a physical device.

## Usage

- Upon launching the application, the user can select different categories to view news articles.
- Users can tap on any news article to view its full content.
- Articles are fetched from a remote API and stored locally in the Room database for offline access.

## Contributing

Feel free to fork this repository and submit pull requests. Any contributions, issues, or feature requests are welcome.
