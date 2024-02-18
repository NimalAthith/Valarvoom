import { useNavigate } from "react-router-dom";
import { UserCookies } from "../lib/User";

function UserSelectorPage() {
  const nagivate = useNavigate();
  UserCookies.setUser("1");
  return <button onClick={() => nagivate(-1)}>UserSelectorPage</button>;
}

export default UserSelectorPage;
