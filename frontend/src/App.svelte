<script lang="ts">
  import { Route, Router } from "svelte-navigator";
  import HomePage from "./Page/HomePage.svelte";
  import { UserCookies } from "./lib/Cookies/User";
  import NoUserPage from "./Page/NoUserPage.svelte";
  import { user } from "./store/user";
</script>

{#if $user}
  <Router>
    <Route path="/" component={HomePage} />
  </Router>
{:else}
  <NoUserPage />
{/if}
