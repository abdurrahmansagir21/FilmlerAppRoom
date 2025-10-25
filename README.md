# FİLMLER UYGULAMASI (ROOM)

Bu proje, Udemy platformunda yer alan Kasım Adalan'ın "Android Bootcamp Programı | Kotlin | 2025" adlı eğitim setinin bir parçası olarak geliştirilmiştir.
Bu proje, modern Android geliştirme prensipleri kullanılarak geliştirilmiş bir **film kataloğu uygulamasıdır**.
Uygulama, filmleri bir ana sayfada listeler ve kullanıcı bir filme tıkladığında o filmin detaylarını gösterir.

Proje, **MVVM (Model-View-ViewModel)** mimarisi ile **Kotlin** dilinde geliştirilmiştir. Veri yönetimi için **Room**, bağımlılık yönetimi için **Hilt** ve asenkron işlemler için **Coroutines** kullanılmıştır.

## Özellikler

- Filmleri ana sayfada `RecyclerView` ile listeleme
- Bir filmin detaylarını ayrı bir sayfada gösterme
- `Navigation Component` ile sayfalar arası güvenli geçiş

## Kullanılan Teknolojiler

- **Kotlin:** Uygulamanın ana dili
- **MVVM Mimarisi:** Veri ve kullanıcı arayüzü ayrımı
- **Room Persistence Library:** SQLite veritabanı işlemleri
- **Hilt (Dagger):** Bağımlılık enjeksiyonu
- **Android Jetpack Bileşenleri:**
  - `ViewModel`
  - `LiveData`
  - `Navigation Component`
- **Coroutines:** Asenkron işlemler
- **ViewBinding:** XML view’larına güvenli erişim
- **Glide:** Resimleri URL'den yüklemek ve göstermek için

## Mimari Yapı

Proje, Google’ın önerdiği katmanlı mimariye uygundur:

- **UI Katmanı (Fragments):**
  `AnasayfaFragment`, `DetayFragment`
  → Kullanıcı etkileşimlerini alır ve ViewModel’e iletir.

- **ViewModel Katmanı:**
  `AnasayfaViewModel`, `DetayViewModel`
  → UI için verileri hazırlar ve durumu yönetir.

- **Repository Katmanı:**
  `FilmlerRepository`
  → Verilerin hangi kaynaktan alınacağını yönetir.

- **Data Katmanı (DataSource & Room):**
  `FilmlerDataSource` ve Room bileşenleri
  → Veritabanı işlemlerini gerçekleştirir.

## Kurulum ve Çalıştırma

```bash
git clone https://github.com/abdurrahmansagir21/FilmlerAppRoom.git
```

1.  Projeyi Android Studio’da açın.
2.  Gradle bağımlılıklarının yüklenmesini bekleyin.
3.  Emülatörde veya cihazda çalıştırın.

## Ekran Görüntüleri

<p align="center">
    <img width="250" src="https://github.com/user-attachments/assets/faa9a3c7-7577-4395-927b-ac7c047d469f" />
  <img width="250" src="https://github.com/user-attachments/assets/55a63632-cf53-4a8e-97ff-c82b4b9b8ba6" />
</p>

---

# MOVIES APP (ROOM)

This project was developed as part of the "Android Bootcamp Program | Kotlin | 2025" course by instructor Kasım Adalan on the Udemy platform.
This project is a **movie catalog application** developed using modern Android development principles.
The app lists movies on a homepage and displays the details of a movie when the user clicks on it.

The project is developed in **Kotlin** following the **MVVM (Model-View-ViewModel)** architecture. It uses **Room** for data persistence, **Hilt** for dependency injection, and **Coroutines** for asynchronous operations.

## Features

- Listing movies on the homepage using a `RecyclerView`
- Displaying the details of a movie on a separate page
- Safe navigation between pages using the `Navigation Component`

## Technologies Used

- **Kotlin:** Main programming language
- **MVVM Architecture:** Separation of UI and business logic
- **Room Persistence Library:** SQLite database abstraction
- **Hilt (Dagger):** Dependency injection
- **Android Jetpack Components:**
  - `ViewModel`
  - `LiveData`
  - `Navigation Component`
- **Coroutines:** For asynchronous operations
- **ViewBinding:** Safe access to XML views
- **Glide:** For loading and displaying images from URLs

## Architecture Overview

The project follows a clean, layered architecture:

- **UI Layer (Fragments):**
  `AnasayfaFragment`, `DetayFragment`
  → Handles user interactions and communicates with the ViewModel.

- **ViewModel Layer:**
  `AnasayfaViewModel`, `DetayViewModel`
  → Prepares and manages data for the UI.

- **Repository Layer:**
  `FilmlerRepository`
  → Manages data from various sources.

- **Data Layer (DataSource & Room):**
  `FilmlerDataSource` and Room components
  → Handles database operations.

## Installation and Run

```bash
git clone https://github.com/abdurrahmansagir21/FilmlerAppRoom.git
```

1.  Open the project in Android Studio.
2.  Wait for Gradle dependencies to sync.
3.  Run the app on an emulator or a physical device.

## Screenshots

<p align="center">
    <img width="250" src="https://github.com/user-attachments/assets/faa9a3c7-7577-4395-927b-ac7c047d469f" />
  <img width="250" src="https://github.com/user-attachments/assets/55a63632-cf53-4a8e-97ff-c82b4b9b8ba6" />
</p>
