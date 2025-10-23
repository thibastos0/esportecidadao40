document.addEventListener("DOMContentLoaded", () => {
    // Seleciona os elementos do menu
    const menuToggleBtn = document.getElementById("mobile-menu-toggle");
    const sidebarCloseBtn = document.getElementById("sidebar-close-btn");
    const sidebar = document.getElementById("app-sidebar");
    const overlay = document.getElementById("sidebar-overlay");

    // Função para abrir o menu
    const openSidebar = () => {
        if (sidebar && overlay) {
            sidebar.classList.add("open");
            overlay.classList.add("open");
        }
    };

    // Função para fechar o menu
    const closeSidebar = () => {
        if (sidebar && overlay) {
            sidebar.classList.remove("open");
            overlay.classList.remove("open");
        }
    };

    // Adiciona eventos de clique
    if (menuToggleBtn) {
        menuToggleBtn.addEventListener("click", openSidebar);
    }

    if (sidebarCloseBtn) {
        sidebarCloseBtn.addEventListener("click", closeSidebar);
    }

    if (overlay) {
        overlay.addEventListener("click", closeSidebar);
    }
});
