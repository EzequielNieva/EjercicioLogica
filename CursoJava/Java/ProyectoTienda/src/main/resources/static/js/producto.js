document.addEventListener("DOMContentLoaded", function() {
    const searchInput = document.getElementById("searchInput");
    const productTableBody = document.getElementById("productTableBody");
    const deleteProductBtns = document.querySelectorAll(".delete-product-btn");

    searchInput.addEventListener("input", filterTable);

    deleteProductBtns.forEach(btn => {
        btn.addEventListener("click", function(event) {
            const productId = this.getAttribute("data-product-id");
            mostrarConfirmacion(productId); // Pasa el ID del producto a la función de confirmación
        });
    });

    function filterTable() {
        const searchTerm = searchInput.value.trim().toLowerCase();
        const rows = productTableBody.getElementsByTagName("tr");
        for (let row of rows) {
            const cells = row.getElementsByTagName("td");
            let matchFound = false;
            for (let cell of cells) {
                const cellText = cell.textContent.toLowerCase();
                if (cellText.includes(searchTerm)) {
                    matchFound = true;
                    break;
                }
            }
            row.style.display = matchFound ? "" : "none";
        }
    }

    function mostrarConfirmacion(productId) {
        console.log("Botón eliminar presionado, ID del producto: ", productId);
        document.getElementById('productIdInput').value = productId;
        document.getElementById('confirmacionMensaje').innerText = `¿Estás seguro de que deseas eliminar el producto con ID ${productId}?`;
        $('#confirmacionModal').modal('show');
    }
});

function eliminarProducto() {
    const productId = document.getElementById('productIdInput').value;
    if (!productId) {
        alert("Por favor, ingresa el ID del producto.");
        return;
    }

    fetch('/products/delete/' + productId, {
        method: 'DELETE'
    })
    .then(response => {
        if (response.ok) {
            alert("El producto ha sido eliminado exitosamente.");
            location.reload(); // Recargar la página
        } else {
            alert("Error al eliminar el producto.");
        }
    })
    .catch(error => console.error('Error:', error));
}
