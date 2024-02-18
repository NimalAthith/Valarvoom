import { BrowserRouter, Navigate, Route, Routes } from "react-router-dom";
import "./App.css";
import Home from "./Page/Home";
import UserSelectorPage from "./Page/UserSelector";
import { UserCookies } from "./lib/User";

function App() {
  const user = UserCookies.getUser();
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/no-user" element={<UserSelectorPage />} />
      </Routes>
      {user ? (
        <Routes>
          <Route path="/" element={<Home />} />
        </Routes>
      ) : (
        <Navigate to={"/no-user"} />
      )}
    </BrowserRouter>
  );
}

export default App;
