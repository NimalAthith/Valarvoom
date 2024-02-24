<script>
  import { navigate } from "svelte-navigator";
  import { UserCookies } from "../lib/Cookies/User";
  import UserSelector from "../Components/Users/UserSelector.svelte";
  import UserHandler from "../Components/Users/UserHandler.svelte";
</script>

<div class=" w-screen h-screen flex bg-gradient-to-br overflow-hidden from-blue-400 to-red-400">
  <UserHandler />
</div>
