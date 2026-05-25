# Task Manager App (24125013)

A simple Android application for the course CS426 to demonstrate the use of **LinearLayout** and XML-based UI design. 

The app displays a task management interface where users can view a list of tasks with titles, priority levels, and due dates.

---

## 📋 Project Overview

This project is built entirely with **XML layouts** and uses a **vertical `LinearLayout`** as the primary layout structure to arrange UI components from top to bottom. It showcases fundamental Android UI concepts including:

- **LinearLayout (vertical orientation)** — stacks child views sequentially from top to bottom
- **XML layout files** — all UI is defined declaratively in XML (`activity_main.xml`, `item_task.xml`)
- **`<include>` tag** — reuses the `item_task.xml` layout to display multiple task cards without duplicating XML
- **Material Design components** — `TextInputLayout`, `TextInputEditText`, `AppBarLayout`, `Toolbar`, and `CardView`
- **ConstraintLayout** — used inside each task card (`item_task.xml`) for flexible item positioning
- **Vector drawable icons** — custom XML drawables for menu, calendar, flag, title, and more

---

## 🏗️ Project Structure

```
TaskManagerApp/
├── app/
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml
│           ├── java/com/example/taskmanagerapp/
│           │   └── MainActivity.kt              # Main activity (Kotlin)
│           └── res/
│               ├── drawable/                     # Vector icon drawables
│               │   ├── ic_calendar.xml
│               │   ├── ic_description.xml
│               │   ├── ic_flag.xml
│               │   ├── ic_menu.xml
│               │   ├── ic_more_vert.xml
│               │   └── ic_title.xml
│               ├── layout/
│               │   ├── activity_main.xml         # Main screen layout (LinearLayout)
│               │   └── item_task.xml             # Reusable task card layout
│               └── values/
│                   ├── colors.xml                # Color definitions
│                   ├── strings.xml               # String resources
│                   └── themes.xml                # App theme
├── build.gradle.kts                              # Root build script
├── gradle/
│   └── libs.versions.toml                        # Version catalog
├── settings.gradle.kts                           # Project settings
└── README.md
```

---

## ⚙️ Prerequisites

Before opening this project, make sure you have the following installed:

| Requirement             | Version / Details                        |
|-------------------------|------------------------------------------|
| **Android Studio**      | Latest stable version (Ladybug or newer) |
| **JDK**                 | JDK 11 or higher                         |
| **Android SDK**         | API 36 (compile SDK)                     |
| **Minimum SDK**         | API 26 (Android 8.0)                     |
| **Gradle**              | Managed by Gradle Wrapper (no manual install needed) |

---

## 🚀 How to Set Up and Build

### Step 1 — Clone or Download the Project

If you received this as a ZIP file, extract it to a folder on your computer.

If using Git:
```bash
git clone https://github.com/namkiet/CS426-Simple-Layout
```

### Step 2 — Open in Android Studio

1. Launch **Android Studio**
2. Click **File → Open** (or **Open** on the Welcome screen)
3. Navigate to the `TaskManagerApp` folder and select it
4. Click **OK**

### Step 3 — Wait for Gradle Sync

Android Studio will automatically start syncing the project with Gradle. Wait until the sync completes successfully. You can monitor the progress in the bottom status bar.

> **Note:** If prompted to update Gradle or SDK components, follow the on-screen instructions to install them.

### Step 4 — Build the Project

Go to **Build → Make Project** (or press `Ctrl + F9`).

Verify that the build completes with **no errors** in the Build output panel.

---

## ▶️ How to Run

### Option A — Run on an Emulator

1. Open **Device Manager** (click the phone icon in the toolbar, or go to **Tools → Device Manager**)
2. Create a new virtual device if you don't have one:
   - Select a phone (e.g., **Pixel 6**)
   - Choose system image **API 36** (or any version ≥ 26)
   - Finish the wizard
3. Select the emulator from the device dropdown in the toolbar
4. Click the green **Run ▶** button (or press `Shift + F10`)

### Option B — Run on a Physical Device

1. Enable **Developer Options** and **USB Debugging** on your Android phone
2. Connect the phone via USB cable
3. Select your device from the device dropdown in the toolbar
4. Click the green **Run ▶** button (or press `Shift + F10`)

---

## 📐 Layout Design Explained

The main screen (`activity_main.xml`) uses a **vertical `LinearLayout`** inside a `NestedScrollView` to stack the following components from top to bottom:

1. **"Add New Task" section title**
2. **Task Title** input field (`TextInputLayout`)
3. **Description** input field (`TextInputLayout`)
4. **Priority** dropdown (`TextInputLayout` + `AutoCompleteTextView`)
5. **Due Date** picker field (`TextInputLayout`)
6. **"ADD TASK" button**
7. **"My Tasks" section title**
8. **Task cards** — three `item_task.xml` cards included via `<include>` tag, displayed in a nested vertical `LinearLayout`

Each task card (`item_task.xml`) uses a `CardView` with a `ConstraintLayout` inside, containing a checkbox, title, priority label, date, and a more-options icon.

---

## 🛠️ Tech Stack

| Component          | Technology                              |
|--------------------|-----------------------------------------|
| **Language**       | Kotlin                                  |
| **UI Framework**   | Android XML Layouts                     |
| **Primary Layout** | LinearLayout (vertical)                 |
| **Build System**   | Gradle (Kotlin DSL) with Version Catalog |
| **Min SDK**        | 26 (Android 8.0 Oreo)                   |
| **Target SDK**     | 36                                      |
| **Dependencies**   | AndroidX AppCompat, Material Components, ConstraintLayout |

---

## 📄 License

This project is for educational purposes.
