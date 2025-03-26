var todos;
var currentTab = "All";

window.onload = () => {
    todos = JSON.parse(localStorage.getItem('todos')) || [];
    displayLists(todos);
};

function displayLists(todos) {
    var taskBox = document.querySelector(".task-box");
    if (!taskBox) return;

    let li = "";
    let filteredTask = [];

    if (currentTab === "All") {
        filteredTask = todos;
    } else {
        filteredTask = todos.filter(eachTodo => eachTodo.category === currentTab);
    }

    console.log("Filtered tasks:", filteredTask);

    if (filteredTask.length > 0) {
        filteredTask.forEach((todo) => {
            let isCompleted = todo.status === "completed" ? "checked" : "";
            let strike = todo.status === "completed" ? "overline-style" : "";

            li += `<li class="task">
                <div>
                    <label for="${todo.id}">
                        <input onclick="updateTask(this, ${todo.id})" type="checkbox" id="${todo.id}" ${isCompleted}>
                        <input type="text" value="${todo.name}" class="${strike}" id="task-${todo.id}" disabled/>
                    </label>
                </div>
                <p>${todo.category}</p>
                <div>
                    <span class="task-controls">
                        <button type="button" onClick="editTask(${todo.id})" id="edit-btn-${todo.id}">Edit</button>
                        <button type="button" onClick="deleteClicked(${todo.id})">Delete</button>
                    </span>
                </div>
            </li>`;
        });
    } else {
        li = `<li  style="text-align: center; margin-top:45px; color:black;">No tasks have been added!</li>`;
    }

    taskBox.innerHTML = li;
}


function addTask() {
    var task = document.getElementById('text-box');
    var taskCategory = document.getElementById('category').value;

    if (task.value.trim() === "") return;

    var toDoObj = {
        id: Date.now(),
        name: task.value,
        category: taskCategory,
        status: "progress"
    };

    todos.push(toDoObj);
    localStorage.setItem("todos", JSON.stringify(todos));
    displayLists(todos);
    task.value = "";
}

function updateTask(selectedTask, id) {
    let taskIndex = todos.findIndex(todo => todo.id === id);
    if (taskIndex !== -1) {
        todos[taskIndex].status = selectedTask.checked ? "completed" : "progress";
        localStorage.setItem("todos", JSON.stringify(todos));
        displayLists(todos);
    }
}

function deleteClicked(id) {
    todos = todos.filter(todo => todo.id !== id);
    localStorage.setItem("todos", JSON.stringify(todos));
    displayLists(todos);
}

function editTask(id) {
    let taskInput = document.getElementById(`task-${id}`);
    let editBtn = document.getElementById(`edit-btn-${id}`);

    if (taskInput.disabled) {
        taskInput.disabled = false;
        taskInput.focus();
        editBtn.textContent = "Save";
    } else {
        let taskIndex = todos.findIndex(todo => todo.id === id);
        if (taskIndex !== -1) {
            let newValue = taskInput.value.trim();
            if (newValue === "") {
                alert("Please fill the todo");
                taskInput.value = todos[taskIndex].name;
            } else {
                todos[taskIndex].name = newValue;
                localStorage.setItem("todos", JSON.stringify(todos));
            }
        }
        taskInput.disabled = true;
        editBtn.textContent = "Edit";
    }
}


function setCurrentTab(tab) {
    currentTab = tab;
    displayLists(todos);
}
