////////////////////////////////////////2////////////////////////////////////////////
const fruits = [
  "Apple",
  "Orange",
  "Banana",
  "Strawberry",
  "Grape",
  "Mango",
  "Melon",
  "Pineapple",
  "Peach",
  "Peach",
];

//Get all strings containing the letter 'p'
const allItemsWithP = data.filter((item) => item.toLowerCase().includes("p"));
console.log(allItemsWithP); // Output: ["Apple", "Peach", "Peach"]

//Obtain the ‘Grape’ string.
const grapeString = data.find((item) => item === "Grape");
console.log(grapeString); // Output: "Grape"

///////////////////////////////////////3///////////////////////////////////////////////
const mostrar = (param) => {
  param();
};

const messaje = () => {
  console.log("Etendo!!!");
};

mostrar(messaje); // Output: "Etendo!!!"

///////////////////////////////////////4/////////////////////////////////////////////

function checkDiagonalMatrix(matrix) {
  //i must be interpreted as the row number
  //i debe ser interpretado como el numero de columna
  for (let i = 0; i < matrix.length; i++) {
    //J must be interpreted as column number
    //j debe ser interpretado como el numero de columna
    for (let j = 0; j < matrix[i].length; j++) {
      if (i !== j && matrix[i][j] !== 0) {
        return false;
      }
    }
  }
  return true;
}

const diagonalMatrix = [
  [1, 0, 0],
  [0, 2, 0],
  [0, 0, 3],
];
const nonDiagonalMatrix = [
  [1, 0, 0],
  [0, 2, 3],
  [0, 0, 3],
];

console.log(checkDiagonalMatrix(diagonalMatrix)); // Output: true
console.log(checkDiagonalMatrix(nonDiagonalMatrix)); // Output: false
